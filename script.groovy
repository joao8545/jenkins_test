pipelineJob('example') {
    definition {
        cps {
          script('''
          |pipeline{
          |     agent any
          |     stages{
          |         stage('stage1') {
          |             echo 'hello world'
          |         }
          |     }
          |}'''.stripMargin())
            sandbox()
        }
    }
}
