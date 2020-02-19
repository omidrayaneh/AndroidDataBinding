# Android-Data-Binding

Data Binding Library is a support library that enables you to bind UI elements in your layouts to data sources in your app using a declarative style rather than programmatically.

#sample :

TextView userName=findViewById(R.id.userName); userName.setText(getCurrentUser().getUserName);

TextView userEmail=findViewById(R.id.userEmail); userEmail.setText(getCurrentUser().getUserEmail);

#change to :

activityMainBinding.setUser(getCurrentUser());
