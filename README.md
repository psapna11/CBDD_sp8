# CBDD_sp8
Java
# How to run the test
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="@smoke"

mvn verify -Denv=qa -Dbrowser=chrome -D"cucumber.filter.tags=@smoke"