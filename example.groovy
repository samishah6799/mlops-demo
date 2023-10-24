def deploy(String branch_name) {
  if (branch_name == "PROD") {
    println "Deploying to Production."
  } else if (branch_name == "TEST") {
    println "Deploying to Test."
  } else {
    println "Deploying to Dev."
  }
}

def build(String ok) {
  println "Building with parameter: $ok"
  sh 'pip3 install -r requirements.txt'
}

return this
