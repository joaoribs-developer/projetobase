package com.webposto.bombas.configuration

import jakarta.annotation.PostConstruct
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate

@Configuration
class AppConfig(private val jdbcTemplate: JdbcTemplate) {

    @PostConstruct
    fun initDataBase() {
        listOf(
            """
                CREATE TABLE IF NOT EXISTS abastecimentos (
                  controle INTEGER NOT NULL,
                   bomba VARCHAR(3),
                   total DECIMAL(18, 2),
                   codpro VARCHAR(5),
                   idfrentista VARCHAR(5),
                   imprimiu VARCHAR(1),
                   litros DECIMAL(18, 3),
                   data date,
                   pu DECIMAL(18, 3),
                   CONSTRAINT pk_abastecimentos PRIMARY KEY (controle)
                )
            """.trimIndent(),
            """
               INSERT INTO abastecimentos (controle, bomba, total, codpro, idfrentista, imprimiu, litros, data, pu)
               VALUES (1, 'A1', 150.50, 'P001', 'F001', 'Y', 50.500, '2024-05-20', 2.980);
            """.trimIndent(),
            """
               INSERT INTO abastecimentos (controle, bomba, total, codpro, idfrentista, imprimiu, litros, data, pu)
               VALUES (2, 'B2', 200.75, 'P002', 'F002', 'N', 70.250, '2024-05-19', 2.857);
            """.trimIndent(),
            """
               INSERT INTO abastecimentos (controle, bomba, total, codpro, idfrentista, imprimiu, litros, data, pu)
               VALUES (3, 'C3', 180.00, 'P003', 'F003', 'Y', 60.000, '2024-05-18', 3.000);
            """.trimIndent(),
            """
               INSERT INTO abastecimentos (controle, bomba, total, codpro, idfrentista, imprimiu, litros, data, pu)
               VALUES (4, 'D4', 220.00, 'P004', 'F004', 'N', 80.000, '2024-05-17', 2.750);
            """.trimIndent(),
            """
               INSERT INTO abastecimentos (controle, bomba, total, codpro, idfrentista, imprimiu, litros, data, pu)
               VALUES (5, 'E5', 190.60, 'P005', 'F005', 'Y', 65.000, '2024-05-16', 2.932); 
            """.trimIndent()
        ).forEach { sql ->
            jdbcTemplate.execute(sql)
        }
    }
}