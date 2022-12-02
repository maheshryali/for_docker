pipeline {
    agent { label 'DOCKER'}
    stages {
        stage('fordocker') {
            steps {
                sh """
                sudo apt update
                docker info
                docker container run alpine 
                """
            }
        }
    }
}
