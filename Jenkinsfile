pipeline {
    agent any 
    options {
        timestamps()
        timeout(time: 10, unit: 'MINUTES')
        buildDiscarder(logRotator(daysToKeepStr: '7', numToKeepStr: '20', artifactNumToKeepStr: '10', artifactDaysToKeepStr: '7'))
    }
    stages {
        stage('Stage catchError') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE', message: 'error on first step') {
                    sh 'rm report/index.html'
                    sh 'rmdir test1 test2 test3 report '
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
                sh 'mkdir test1 test2 test3 report'
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
                sh 'touch report/index.html'
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
                writeFile file: 'ex1.txt', text: 'this tis a file to archive\n'
                sh 'git log --oneline --decorate --all --graph > ex2.txt'
            }
        }
        stage('Stage archiveArtifacts') {
            steps{
                archiveArtifacts artifacts: 'ex1.txt', followSymlinks: false
                archiveArtifacts artifacts: 'ex2.txt', followSymlinks: false
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
        stage('Stage changelog') {
            steps{
                //sh "touch changelog.txt"
                script{
                    def changeLogSets = currentBuild.changeSets
                    for (int i = 0; i < changeLogSets.size(); i++) {
                        def entries = changeLogSets[i].items
                        for (int j = 0; j < entries.length; j++) {
                            def entry = entries[j]
                            //sh "echo \"${entry.commitId} by ${entry.author} on ${new Date(entry.timestamp)}: ${entry.msg}\">>changelog.txt"
                            def files = new ArrayList(entry.affectedFiles)
                            for (int k = 0; k < files.size(); k++) {
                                def file = files[k]
                                //sh " echo \" ${file.editType.name} ${file.path}\">>changelog.txt"
                            }
                        }
                    }
                }
                //archiveArtifacts artifacts: 'changelog.txt', followSymlinks: false
            }
            
        }
        stage('Stage Publish') {
            steps{
                sh 'echo "hello world" > report/index.html'
                publishHTML([allowMissing: true, alwaysLinkToLastBuild: false, keepAll: true, reportDir: 'report', reportFiles: 'index.html', reportName: 'HTML Report'])
                
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
        rionegress { 
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
