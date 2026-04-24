pipeline {
    agent any

    environment {
        NAME = "Heba"
    }

    stages {
        stage('Build') {
            steps {
                echo "Building.."
                echo "Hello ${NAME}"
            }
        }

        stage('Test') {
            when {
                expression { false }
            }
            steps {
                echo 'Testing..'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished!'
        }
    }
}
