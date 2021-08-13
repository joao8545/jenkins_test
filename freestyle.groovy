freeStyleJob('NEWexample1') {
    logRotator(-1, 10)
    scm{
        github('joao8545/jenkins_test')
    }
    steps{
        
       
        shell("touch a")
        
    }    
    triggers {
        githubPush()
        upstream('NEWexample', 'SUCCESS')
    }
}
