pipelineJob('example1') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials "${GITHUB_CRED_USR}"
                        url "https://github.com/${GITHUB_CRED_USR}/jenkins_test"
                    }
                    
                }
            }


            script('''
            |pipeline{
            |   agent any
            |   stages{
            |       stage('stage1') {
            |           steps{       
            |               echo 'hello world!'
            |           }
            |       }
            |   }
            |}'''.stripMargin())
            sandbox()
        }
    }
}
