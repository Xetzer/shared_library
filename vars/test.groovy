//String app = '',
def call(Map config = [:], String snapshot = '') {
   //print application
   def artifact_name = (snapshot == '') ? 'release' : 'snapshot'
   return artifact_name
}

return this;
