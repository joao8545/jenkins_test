pipelineJob('example') {
    definition {
        cpsScm {
            scm {
                github('joao8545/jenkins_test')
            }

            scriptPath("pipeline")
            
        }
    }
    triggers {
        upstream('JobDSL', 'UNSTABLE')
    }
}
