import pandas as pd

# import numpy as np  # Removed unused import
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_absolute_error, r2_score
import joblib  # type: ignore


data = {
    "Hours": [
        2.5,
        5.1,
        3.2,
        8.5,
        3.5,
        1.5,
        9.2,
        5.5,
        8.3,
        2.7,
        7.7,
        5.9,
        4.5,
        3.3,
        1.1,
        8.9,
        2.5,
        1.9,
        6.1,
        7.4,
    ],
    "Scores": [
        21,
        47,
        27,
        75,
        30,
        20,
        88,
        60,
        81,
        25,
        85,
        62,
        41,
        42,
        17,
        95,
        30,
        24,
        67,
        69,
    ],
}

df = pd.DataFrame(data)
print("Data Head:\n", df.head())


plt.scatter(df["Hours"], df["Scores"], color="blue")
plt.title("Hours vs Scores")
plt.xlabel("Hours Studied")
plt.ylabel("Scores Obtained")
plt.show()


# Prepare the data
X = df[["Hours"]]
y = df["Scores"]

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

# Train the model
model = LinearRegression()
model.fit(X_train, y_train)


# Make predictions
y_pred = model.predict(X_test)


# compare the data
comparison_df = pd.DataFrame({"Actual": y_test, "Predicted": y_pred})
print("\nComparison of Actual and Predicted Scores:\n", comparison_df)


# Evaluate the model
print("Mean Absolute Error:", mean_absolute_error(y_test, y_pred))
print("R2 Score:", r2_score(y_test, y_pred))


# save the model
joblib.dump(model, "student_score_model.pkl")
print("✅ Model saved successfully!")
