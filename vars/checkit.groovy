//String app = '',
def call(Map config = [:], String branch = '') {
  print branch
  checkout scm: [
    $class : 'GitSCM',
    branches : [[name: branch ?: config.branch]],
    doGenerateSubmoduleConfigurations: false,
    extensions: [
      [$class: 'LocalBranch', localBranch: branch ?: config.branch],
      [$class: 'PruneStaleBranch'],
      [$class: 'CleanCheckout'],
    ],
    userRemoteConfigs: [
      [
        url: "${config.gitlabUrl}/${config.application}.git",
      ]
    ]
  ]
}

return this;
