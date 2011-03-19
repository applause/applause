from django.db import models

class Session(models.Model):
    session_id = models.CharField(max_length=20, primary_key=True)
    
    category = models.CharField(max_length=100)
    abstract = models.TextField()
    type = models.CharField(max_length=50)
    title = models.CharField(max_length=200)
    room = models.CharField(max_length=100)

    #date = models.DateTimeField(blank=True)
    start_time = models.DateTimeField(null=True)
    end_time = models.DateTimeField(null=True)
    
    def presenters(self):
        return [p.speaker for p in self.participation_set.all()]
    
    def hasTimeslot(self):
        return self.start_time and self.end_time
    
    def timeslotWithFormat(self, f1, f2):
        if self.hasTimeslot():
            start = self.start_time.strftime(f1)
            end = self.end_time.strftime(f2)
            #start = "s"
            #end = "e"  
            return "%s - %s " % (start, end)

        else:
            return "no time slot"
        
    def timeslot_long(self):
        return self.timeslotWithFormat("%A %d, %H:%M", "%H:%M")     
        
    def timeslot_short(self):
        return self.timeslotWithFormat("%H:%M", "%H:%M")     

    def __unicode__(self):
        return self.title

class Speaker(models.Model):
    speaker_id = models.CharField(max_length=20, primary_key=True)
    
    first_name = models.CharField(max_length=200, null=True)
    last_name = models.CharField(max_length=200, null=True)
    affiliation = models.CharField(max_length=200)
    bio = models.TextField()
    
    def sessions(self):
        return [p.session for p in self.participation_set.all()]

    def full_name(self):
        if self.first_name and self.last_name:
            return self.first_name + " " + self.last_name
        else:
            return (self.first_name or "") + (self.last_name or "")
    
    def first_letter(self):
        if self.last_name > "":
            return self.last_name[0:1]
        else:
            return "123";
    
    def image_url(self):
        #if self.speaker_id in ['jmusset', 'eclipsefoundation', 'iabdulrahim', 'sbordet', 'zbeothyelo', 'dbisky-groh', 'gboccalon', 'dburkhart', 'dkarim', 'jcaesar', 'michaela', 'aimrie', 'siwai1', 'tkaiser', 'hkornmaye', 'hkornmayer', 'hkornmayer1', 'hkugler', 'glefur', 'fmadiot', 'lmilewski', 'kpi281ta', 'aplatov', 'apupier1', 'nsasidharan', 'sschuerle', 'auhl1', 'aunger1']:
        #    file = "111-user.png"
        #return "https://www.eclipsecon.org/submissions/ese2010/callbacks/show_image.php?PersonID=%s" % self.speaker_id
        file = "%s.png" % self.speaker_id
        host= "http://eclipsesummit2010.appspot.com"
        return "%s/media/files/speakers/%s" % (host, file)
        
    def __unicode__(self):
        return self.full_name()
    
class Participation(models.Model):
    session = models.ForeignKey(Session)
    speaker = models.ForeignKey(Speaker)

    def __unicode__(self):
        return "session(%s) <=> speaker(%s)" % (self.session.session_id, self.speaker.speaker_id)
    