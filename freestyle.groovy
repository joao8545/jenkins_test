freeStyleJob('example1') {
    logRotator(-1, 10)
    scm{
        github('joao8545/jenkins_test')
    }
    steps{
        groovyScriptFile("freestyle")
        python{
            command("print('Hello World')")
        }
        shell("touch a")
    }    
    triggers {
        githubPush()
    }
}