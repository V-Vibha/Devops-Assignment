pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install' // Execute Maven build
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test' // Execute Maven tests
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy' // Deploy to a Maven repository or any other deployment step
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!' // Print a success message
        }
        failure {
            echo 'Pipeline failed. Please check the build logs.' // Print a failure message
        }
    }
}
