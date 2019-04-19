//String app = '',
def call(String snapshot = '') {
   def artifact_name = (snapshot == '') ? 'release' : 'snapshot'
   return artifact_name
}

return this;
