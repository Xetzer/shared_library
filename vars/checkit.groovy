//
def call(String app = '', Map config = [:]) {
  checkout scm: [
    $class : 'GitSCM',
    branches : [[name: "${config.branch}"]],
    doGenerateSubmoduleConfigurations: false,
      [$class: 'LocalBranch', localBranch: "${config.branch}"],
      [$class: 'PruneStaleBranch'],
      [$class: 'CleanCheckout'],
    ],
    userRemoteConfigs: [
      [
        url: "${config.gitlabUrl}/${config.application}.git",
      ]
    ]
}

return this;
