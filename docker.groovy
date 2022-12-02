pipeline {
    agent { label 'DOCKER'}
    stages {
        stage('fordocker') {
            steps {
                sh """
                sudo apt update
                docker info
                cd for_docker
                docker image build -t nginx:latest .
                docker image ls
                docker run container --name nginxcontainer nginx:latest
                docker container ls -a
                """
            }
        }
    }
}
