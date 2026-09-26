package com.example.midtermmobdev

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DeliveriesScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF181818))
            .padding(18.dp)
    ) {

        Text(
            text = "Deliveries",
            color = Color.White,
            fontSize = 26.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        DeliveryItem(
            station = "Station 04 -> Angeles",
            details = "1,200L diesel • Enroute",
            status = "on time",
            statusColor = Color.Green
        )

        Spacer(modifier = Modifier.height(12.dp))

        DeliveryItem(
            station = "Station 11 -> Mabalacat",
            details = "800L gasoline • Pending",
            status = "delayed",
            statusColor = Color(0xFFFFA000)
        )

        Spacer(modifier = Modifier.height(12.dp))

        DeliveryItem(
            station = "Station 02 -> San Fernando",
            details = "1,500L diesel • scheduled",
            status = "Queued",
            statusColor = Color.LightGray


        )
    }
}



@Composable
fun DeliveryItem(
    station: String,
    details: String,
    status: String,
    statusColor: Color
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF101010)
        )
    ) {



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {


            Text(
                text = "⛽",
                fontSize = 49.sp
            )

            Spacer(modifier = Modifier.width(15.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = station,
                    color = Color.White,
                    fontSize = 17.sp
                )

                Text(
                    text = details,
                    color = Color.LightGray,
                    fontSize = 14.sp
                )
            }

            Text(
                text = status,
                color = statusColor
            )
        }
    }
}