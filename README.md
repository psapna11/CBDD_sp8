# CBDD_sp8
Java
# How to run the test
//mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="@hb"//not working

mvn verify -Denv=qa -Dbrowser=chrome -D"cucumber.filter.tags=@hb"

mvn verify -Denv=stage -Dbrowser=chrome -D"cucumber.filter.tags=@hb"