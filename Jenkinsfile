pipeline {

  agent any 
  
  stages {
  
  stage("Build") {
      steps {
      
      echo 'building app ..'
      sh "docker build -t test-image"
      sh "docker run --rm -p 8085:8080 test-image"
      
      }
  }
    
     stage("Test") {
      steps {
      
        echo "testing app .. ${BRANCH_NAME}"
      
      }
  }
  
  stage("Deploy") {
      steps {
      
      echo 'deploying app ..'
      
      }
  }
  
  }

}
