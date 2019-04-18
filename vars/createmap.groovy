import groovy.transform.Field

def call(String app = '') {
  return config.get(app) 
}

@Field
def config = [
        "nr-elasticsearch17-app" : [application: 'newsroom-apps/nr-elasticsearch17-app', runSonar: false, branch: 'integration', buildTool: 'gradle', multimo],
        "nr-publication-directory-app" : [application: 'newsroom-apps/nr-publication-directory-app', runSonar: true, branch: 'integration-ES1.7', buildTool: 'gradle']
]

return this;
