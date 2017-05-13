# Heroku - Play - CRUD App

This simple application demonstrates a Play CRUD App on Heroku free instance using H2. I have noted that NoSQL databases available as Heroku add-on elements though free, require user identification is done via valid credit cards. I have avoided providing my credit card number, so I havent put a NoSQL example that I would have loved to get done using a NoSQL database.

# Pre-requisite 

## Heroku Installation

```
sudo apt-get install software-properties-common # debian only
$ sudo add-apt-repository "deb https://cli-assets.heroku.com/branches/stable/apt ./"
$ curl -L https://cli-assets.heroku.com/apt/release.key | sudo apt-key add -
$ sudo apt-get update
$ sudo apt-get install heroku
```
## SignUp for Heroku

https://signup.heroku.com/identity

# How To Run

1. Clone the Git repository ```git clone ....```
1. Make any changes necessary and push the repository to the master branch.
1. Push the master branch to Heroku: ```git push heroku master```

# How to Use The App

Visit the link of Heroku App

1. Add few people entries using Add Button.
1. List Persons Button helps verify all the entries added.
1. Update the name of the existing entry and it is reflected/verified by clicking the List Persons button
1. Delete a person's record by entering the name

# Improvements/Bugs

Please log any feature requests/bugs/pull-requests to GitHub page.


