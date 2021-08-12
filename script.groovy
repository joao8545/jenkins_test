pipelineJob('example1') {
    definition {
        cpsScm {
            scm {
                github('joao8545/jenkins_test')
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
