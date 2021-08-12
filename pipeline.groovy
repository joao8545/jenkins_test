pipelineJob('example1') {
    definition {
        cpsScm {
            scm {
                github('joao8545/jenkins_test')
            }

            scriptPath("pipeline")
            
        }
    }
}
