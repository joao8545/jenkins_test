<<<<<<< HEAD
pipeline {
    agent any 
    stages {
        stage('Stage catchError') {
            steps {
                catchError{
                    sh 'unknown commmand'
                }
                step(echo "error")  
            }
        }
        stage('Stage deleteDir') {
            steps {
                dir {deleteDir} 
            }
        }
        stage('Stage dir') {
            steps {
                dir 'test/' 
            }
        }
        stage('Stage echo') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('Stage mail') {
            steps {
                mail( 'Hello world!','body','joao.anastacio.almeida@ericsson.com' )
            }
        }
        stage('Stage pwd') {
            steps {
                pwd 
            }
        }
        stage('Stage 2') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('Stage 3') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('Stage 4') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('Stage 5') {
            steps {
                echo 'Hello world!' 
            }
        }

    }
}

=======
pipeline {
    agent any 
    options {
        timestamps()
        timeout(time: 2, unit: 'MINUTES')
        buildDiscarder(logRotator(daysToKeepStr: '7', numToKeepStr: '20', artifactNumToKeepStr: '10', artifactDaysToKeepStr: '7'))
    }
    stages {
        stage('Stage catchError') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE', message: 'error on first step') {
                    sh 'rmdir test1 test2 test3'
                    sh 'hello'
                // some block
                }
            }
            post { 
                always { 
                    echo 'I will always say Hello again!'
                }
                changed { 
                    echo 'I am a chameleon'
                }
                fixed { 
                    echo 'its fixed'
                }
                regression { 
                    echo 'It is not linear'
                }
                aborted { 
                    echo 'Abort!'
                }
                failure { 
                    echo 'FAIL'
                }
                success { 
                    echo 'Eureka'
                }
                unstable { 
                    echo 'It is not stable'
                }
                unsuccessful { 
                    echo 'It was not a success'
                }
                cleanup { 
                    echo 'I will clean up'
                }
            }
        }
        stage('Stage deleteDir') {
            steps {
                sh 'pwd'
                sh 'ls'
                sh 'mkdir test1 test2 test3'
                sh 'ls'
                dir ('test1'){
                    sh 'pwd'
                    deleteDir()
                    sh 'pwd'
                } 
            }
        }
        stage('Stage dir') {
            steps {
                dir ('test2/'){
                    sh 'pwd' 
                }
                
            }
        }
        stage('Stage echo') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('Stage mail') {
            steps {
                catchError(buildResult: 'SUCCESS',message: 'error on mail',stageResult: 'UNSTABLE') {
                    mail bcc: '', body: 'body', cc: '', from: '', replyTo: '', subject: 'hello world', to: 'joao.anastacio.almeida@ericsson.com'
            
                }
            }
            post { 
                always { 
                    echo 'I will always say Hello again!'
                }
                changed { 
                    echo 'I am a chameleon'
                }
                fixed { 
                    echo 'its fixed'
                }
                regression { 
                    echo 'It is not linear'
                }
                aborted { 
                    echo 'Abort!'
                }
                failure { 
                    echo 'FAIL'
                }
                success { 
                    echo 'Eureka'
                }
                unstable { 
                    echo 'It is not stable'
                }
                unsuccessful { 
                    echo 'It was not a success'
                }
                cleanup { 
                    echo 'I will clean up'
                }
            }
        }
        stage('Stage pwd') {
            steps {
                pwd ()
            }
        }
        stage('Stage input') {
            steps {
                input 'should we proceed?'
            }
        }
        stage('Stage writeFile') {
            steps{
                writeFile file: 'ex1.txt', text: 'this tis a file to archive'
            }
        }
        stage('Stage archiveArtifacts') {
            steps{
                archiveArtifacts artifacts: 'ex1.txt', followSymlinks: false
            }
        }
        stage('Stage Parallel') {
            parallel {
                stage('firstBranch') {
                    steps {
                        sleep time: 300, unit: 'MILLISECONDS'
                        echo 'first branch'
                    }
                }
                stage('secondBranch') {
                    steps {
                        sleep time: 200, unit: 'MILLISECONDS'
                        echo 'second branch'
                    }
                }
                stage('thirdBranch') {
                    steps {
                        sleep time: 400, unit: 'MILLISECONDS'
                        echo 'third branch'
                    }
                }
                stage('fourthBranch') {
                    steps {
                        sleep time: 100, unit: 'MILLISECONDS'
                        echo 'fourth branch'
                    }
                }
            }
        }
        stage('Stage script') {
            steps{
                script{
                    for (i=0; i<5; i++) { 
                        print 'This is the step #' +i
                        if (i==0)
                        {
                            echo 'Running on step #0'
                        }
                        else {
                            echo 'Running not on step #0'
                        }
                    }

                }
            }
        }
        
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
        changed { 
            echo 'I am a chameleon'
        }
        fixed { 
            echo 'its fixed'
        }
        regression { 
            echo 'It is not linear'
        }
        aborted { 
            echo 'Abort!'
        }
        failure { 
            echo 'FAIL'
        }
        success { 
            echo 'Eureka'
        }
        unstable { 
            echo 'It is not stable'
        }
        unsuccessful { 
            echo 'It was not a success'
        }
        cleanup { 
            echo 'I will clean up'
        }
    }
}
>>>>>>> fc4717e7265412e12bb2cdfdbf51df731a2a10ca
