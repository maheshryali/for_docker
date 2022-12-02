pipeline {
    agent { label 'DOCKER'}
    stages {
        stage('fordocker') {
            steps {
                sh """
                sudo apt update
                sudo usermod -aG docker ubuntu
                docker info
                docker container run -it alpine bin/bash
                """
            }
        }
    }
}
