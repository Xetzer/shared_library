//String app = '',
def call(String snapshot = '') {
  print app
   def artifact_name = (snapshot == '') ? 'release' : 'snapshot'
   return artifact_name
}

return this;
