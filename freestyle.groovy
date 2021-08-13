freeStyleJob('example1') {
    logRotator(-1, 10)
    scm{
        github('joao8545/jenkins_test')
    }
    steps{
        
        python{
            command("print('Hello World')")
        }
        shell("touch a")
        
    }    
    triggers {
        githubPush()
        upstream('example', 'SUCCESS')
    }
}
