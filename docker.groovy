pipeline {
    agent { label 'DOCKER'}
    stages {
        stage('fordocker') {
            steps {
                sh """
                sudo apt update
                docker info
                docker container run  alpine 
                docker container ls -a
                docker container image ls
                docker container run -it hello-world /bin/bash
                """
            }
        }
    }
}
