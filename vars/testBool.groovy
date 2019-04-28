//String app = '',
def call(Map config = [:], String snapshot = '', Boolean deploy = false) {
   //print application
   //def artifact_name = (snapshot == '') ? 'release' : 'snapshot'
   def artifact_name = (deploy == true) ? 'deploy' : 'dont_deploy'
   println artifact_name
   //return artifact_name
}

return this;
