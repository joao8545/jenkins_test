pipeline {
    agent any 
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
        stage('Stage Parallel') {
            parallel {
                stage('firstBranch') {
                    steps {
                        sleep time: 30, unit: 'MILLISECONDS'
                        echo 'first branch'
                    }
                }
                stage('secondBranch') {
                    steps {
                        sleep time: 20, unit: 'MILLISECONDS'
                        echo 'second branch'
                    }
                }
                stage('thirdBranch') {
                    steps {
                        sleep time: 40, unit: 'MILLISECONDS'
                        echo 'third branch'
                    }
                }
                stage('fourthBranch') {
                    steps {
                        sleep time: 10, unit: 'MILLISECONDS'
                        echo 'fourth branch'
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
