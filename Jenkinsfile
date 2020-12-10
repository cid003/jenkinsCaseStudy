import jenkins.model.*
jenkins = Jenkins.instance

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                mvn test
            }
        }
    }
}
