//String app = '',
def call(Map config = [:]) {
  checkout scm: [
    $class : 'GitSCM',
    branches : [[name: "${config.branch}"]],
    doGenerateSubmoduleConfigurations: false,
    extensions: [
      [$class: 'LocalBranch', localBranch: "${config.branch}" ?: 'master'],
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
