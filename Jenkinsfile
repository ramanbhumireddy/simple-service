pipeline {
    agent any

    tools {
        gradle 'Gradle_9.0.0' // Make sure this matches the Gradle tool name in Jenkins Global Tool Config
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Pulling code from Git repository...'
                git branch: 'main', url: 'https://github.com/ramanbhumireddy/simple-service.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application with Gradle...'
                sh 'chmod +x gradlew'
                sh './gradlew clean build -x test'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests with Gradle...'
                sh './gradlew test'
            }
        }

        stage('Docker Build & Push') {
            steps {
                echo 'Building Docker image...'

            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
