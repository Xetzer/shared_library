import groovy.transform.Field

@Field
//Map config = [application: 'Ihar.Lahutka/nr-publication-directory-app', branch: 'integration-ES1.7', buildTool: 'gradle', runSonar: false, multiModule: false]
Map config = [
        "nr-elasticsearch17-app" : [application: 'newsroom-apps/nr-elasticsearch17-app', runSonar: false, branch: 'integration', buildTool: 'gradle'],
        "nr-publication-directory-app" : [application: 'newsroom-apps/nr-publication-directory-app', runSonar: true, branch: 'integration-ES1.7', buildTool: 'gradle']
]

def call(String app = '') {
  value = config.app
}

return this;
