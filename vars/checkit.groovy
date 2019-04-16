//String app = '',
def call(Map config = [:], String branch = '') {
  checkout scm: [
    $class : 'GitSCM',
    branches : [[name: config.branch ?: 'master']],
    doGenerateSubmoduleConfigurations: false,
    extensions: [
      [$class: 'LocalBranch', localBranch: config.branch ?: 'master'],
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
