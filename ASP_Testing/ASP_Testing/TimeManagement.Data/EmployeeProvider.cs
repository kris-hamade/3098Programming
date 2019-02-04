using System;
using System.Collections.Generic;
using System.Text;
using System.Data.SqlClient;
using Dapper;

namespace TimeManagement.Data
{
    public class EmployeeProvider : IEmployeeProvider
    {
        private readonly string connectionString;

        public EmployeeProvider(string connectionString)
        {
            this.connectionString = connectionString;
        } 
        
        public IEnumerable<Employee> Get()
        {
            IEnumerable<Employee> employee = null;

            using (var connection = new SqlConnection(connectionString))
            {
                employee = connection.Query<Employee>("select id, first_name as FirstName, last_name as LastName, address as Address, home_phone as HomePhone, cell_phone as CellPhone from Employee");

            }


            return employee;
        }
    }
}
