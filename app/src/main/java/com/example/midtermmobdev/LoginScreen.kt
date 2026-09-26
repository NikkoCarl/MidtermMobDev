package com.example.midtermmobdev

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    var email by rememberSaveable {
        mutableStateOf("")
    }

    var password by rememberSaveable {
        mutableStateOf("")
    }

    var showLoginDialog by remember {
        mutableStateOf(false)
    }

    var showForgotDialog by remember {
        mutableStateOf(false)
    }

    var showErrorDialog by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF181810)),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "🚚",
                fontSize = 45.sp
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Text(
                text = "Welcome Back!",
                fontSize = 26.sp,
                color = Color.White
            )

            Text(
                text = "Sign in to continue",
                fontSize = 15.sp,
                color = Color.Cyan
            )

            Spacer(
                modifier = Modifier.height(30.dp)
            )

            Text(
                text = "Email",
                modifier = Modifier.fillMaxWidth(),
                color = Color.White
            )

            Spacer(
                modifier = Modifier.height(5.dp)
            )

            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                placeholder = {
                    Text("name@company.com")
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(15.dp)
            )

            Text(
                text = "Password",
                modifier = Modifier.fillMaxWidth(),
                color = Color.White
            )

            Spacer(
                modifier = Modifier.height(5.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                placeholder = {
                    Text("Password")
                },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Button(
                onClick = {

                    if (email.isNotBlank() && password.isNotBlank()) {
                        showLoginDialog = true
                    } else {
                        showErrorDialog = true
                    }

                },
                modifier = Modifier.fillMaxWidth()
            ) {

                Text("Sign in")
            }

            TextButton(
                onClick = {
                    showForgotDialog = true
                }
            ) {

                Text("Forgot Password?")
            }
        }
    }

    if (showLoginDialog) {

        AlertDialog(
            onDismissRequest = {
                showLoginDialog = false
            },
            title = {
                Text("Login")
            },
            text = {
                Text("Logging in as $email")
            },
            confirmButton = {

                Button(
                    onClick = {
                        showLoginDialog = false
                    }
                ) {

                    Text("Okay")
                }
            }
        )
    }

    if (showForgotDialog) {

        AlertDialog(
            onDismissRequest = {
                showForgotDialog = false
            },
            title = {
                Text("Forgot Password")
            },
            text = {
                Text("Work in Progress")
            },
            confirmButton = {

                Button(
                    onClick = {
                        showForgotDialog = false
                    }
                ) {

                    Text("OK")
                }
            }
        )
    }

    if (showErrorDialog) {

        AlertDialog(
            onDismissRequest = {
                showErrorDialog = false
            },
            title = {
                Text("Missing information")
            },
            text = {
                Text("Email and password must be filled.")
            },
            confirmButton = {

                Button(
                    onClick = {
                        showErrorDialog = false
                    }
                ) {

                    Text("OK")
                }
            }
        )
    }
}