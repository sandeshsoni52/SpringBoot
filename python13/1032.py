import requests

url = "http://localhost:8080/addPerson"

# Properly formatted JSON data
payload = {
    "name": "1033",
    "email": "email1033"
}

# Set the correct Content-Type header
headers = {
    "Content-Type": "application/json"
}

# Use `json=payload` instead of `data=payload` for JSON requests
response = requests.post(url, headers=headers, json=payload)

print(response.text)
