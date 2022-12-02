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
                docker run container --name mahesh nginx:latest
                docker container ls -a
                """
            }
        }
    }
}
