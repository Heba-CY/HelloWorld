pipeline {
    agent any

    environment {
        NAME = "Heba"
    }

    parameters {
        booleanParam(name: 'RUN_TEST', defaultValue: true, description: 'Run test stage or not')
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
                expression { params.RUN_TEST }
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
