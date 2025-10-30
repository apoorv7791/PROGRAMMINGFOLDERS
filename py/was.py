
# Import the necessary libraries
import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score

# Sample data
data = [
    {'Age': 22, 'Salary': 20000, 'Purchased': 0},
    {'Age': 25, 'Salary': 25000, 'Purchased': 0},
    {'Age': 47, 'Salary': 50000, 'Purchased': 1},
    {'Age': 52, 'Salary': 52000, 'Purchased': 1},
    {'Age': 46, 'Salary': 48000, 'Purchased': 1},
    {'Age': 56, 'Salary': 60000, 'Purchased': 1},
    {'Age': 55, 'Salary': 58000, 'Purchased': 1},
    {'Age': 60, 'Salary': 62000, 'Purchased': 1}
]

# Convert it into data frame
df = pd.DataFrame(data)

X = df[['Age', 'Salary']]
y = df['Purchased']


# Split the data for trainging and testing 
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

model = LogisticRegression()

# Train the model
model.fit(X_train, y_train)

# Make predictions on the test set
y_pred = model.predict(X_test)

# Calculate and print the accuracy
accuracy = accuracy_score(y_test, y_pred)
print(f"Model Accuracy: {accuracy * 100:.2f}%")

# Print the test data and predictions
print("\nTest Data:")
print(X_test)
print("\nActual Values:")
print(y_test.values)
print("\nPredicted Values:")
print(y_pred)
