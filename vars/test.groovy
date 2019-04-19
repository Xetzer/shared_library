//String app = '',
def call(application, tring snapshot = '') {
   print application
   def artifact_name = (snapshot == '') ? 'release' : 'snapshot'
   return artifact_name
}

return this;
