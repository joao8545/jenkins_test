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

