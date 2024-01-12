# request contains string
requestResponse.request().toString().contains(<string>)

# request method
requestResponse.request().method() == "<method>"

# request header. Cookies need to be gotten from here
requestResponse.request().header("<header-name>").value().contains("<value>")

# request query
requestResponse.request().query().contains("<string>")

# domain
requestResponse.request().httpService().host().contains("<string>") 

# response contains string
requestResponse.response().bodyToString().contains("<string>")

# response status codes
requestResponse.response().statusCode() == <status_code>

