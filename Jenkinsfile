pipeline {
  agent any
  stages {
    stage('pr_test') {
      steps {
        sh 'mvn clean'
        sh 'mvn compile test'
      }
    }
  }
}