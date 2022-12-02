pipeline {
    agent { label 'DOCKER'}
    stages {
        stage('fordocker') {
            steps {
                sh """
                sudo apt update
                docker info
                docker image build -t nginx:latest .
                docker image ls
                docker container run --name mahesh2 nginx:latest
                docker container ls -a
                """
            }
        }
    }
}
