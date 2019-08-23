package com.example.healthplusapp.repository.directory

import com.example.healthplusapp.`object`.Clinic
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

import java.util.ArrayList

object ClinicRepository {

    val clinic: Clinic
        get() {

            val clinicArrayList = Gson().fromJson<ArrayList<Clinic>>(json, object : TypeToken<ArrayList<Clinic>>() {

            }.type)

            return clinicArrayList[0]
        }

    val clinicList: ArrayList<Clinic>
        get() = Gson().fromJson<ArrayList<Clinic>>(json, object : TypeToken<ArrayList<Clinic>>() {

        }.type)

    internal var json = "[\n" +
            "  {\n" +
            "    \"id\":\"1\",\n" +
            "    \"name\":\"Clínica Santa Helena\",\n" +
            "    \"city\":\"São Paulo\",\n" +
            "    \"type\":\"clinica\",\n" +
            "    \"image\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\",\n" +
            "    \"rating_count\":\"80\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"10\",\n" +
            "    \"total_like\":\"100\",\n" +
            "    \"total_comment\":\"5\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.teste.com\",\n" +
            "    \"phone\":\"(11)99971-4475\",\n" +
            "    \"email\":\"teste@gmail.com\",\n" +
            "    \"desc\":\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\",\n" +
            "    \"address\":\"Rua Deputado Silva, 895\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"1\",\n" +
            "    \"name\":\"Clínica Santa Helena\",\n" +
            "    \"city\":\"São Paulo\",\n" +
            "    \"type\":\"clinica\",\n" +
            "    \"image\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\",\n" +
            "    \"rating_count\":\"80\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"10\",\n" +
            "    \"total_like\":\"100\",\n" +
            "    \"total_comment\":\"5\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.teste.com\",\n" +
            "    \"phone\":\"(11)99971-4475\",\n" +
            "    \"email\":\"teste@gmail.com\",\n" +
            "    \"desc\":\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\",\n" +
            "    \"address\":\"Rua Deputado Silva, 895\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"1\",\n" +
            "    \"name\":\"Clínica Santa Helena\",\n" +
            "    \"city\":\"São Paulo\",\n" +
            "    \"type\":\"clinica\",\n" +
            "    \"image\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\",\n" +
            "    \"rating_count\":\"80\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"10\",\n" +
            "    \"total_like\":\"100\",\n" +
            "    \"total_comment\":\"5\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.teste.com\",\n" +
            "    \"phone\":\"(11)99971-4475\",\n" +
            "    \"email\":\"teste@gmail.com\",\n" +
            "    \"desc\":\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\",\n" +
            "    \"address\":\"Rua Deputado Silva, 895\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"1\",\n" +
            "    \"name\":\"Clínica Santa Helena\",\n" +
            "    \"city\":\"São Paulo\",\n" +
            "    \"type\":\"clinica\",\n" +
            "    \"image\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\",\n" +
            "    \"rating_count\":\"80\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"10\",\n" +
            "    \"total_like\":\"100\",\n" +
            "    \"total_comment\":\"5\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.teste.com\",\n" +
            "    \"phone\":\"(11)99971-4475\",\n" +
            "    \"email\":\"teste@gmail.com\",\n" +
            "    \"desc\":\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\",\n" +
            "    \"address\":\"Rua Deputado Silva, 895\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"1\",\n" +
            "    \"name\":\"Clínica Santa Helena\",\n" +
            "    \"city\":\"São Paulo\",\n" +
            "    \"type\":\"clinica\",\n" +
            "    \"image\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\",\n" +
            "    \"rating_count\":\"80\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"10\",\n" +
            "    \"total_like\":\"100\",\n" +
            "    \"total_comment\":\"5\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.teste.com\",\n" +
            "    \"phone\":\"(11)99971-4475\",\n" +
            "    \"email\":\"teste@gmail.com\",\n" +
            "    \"desc\":\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\",\n" +
            "    \"address\":\"Rua Deputado Silva, 895\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"1\",\n" +
            "    \"name\":\"Clínica Santa Helena\",\n" +
            "    \"city\":\"São Paulo\",\n" +
            "    \"type\":\"clinica\",\n" +
            "    \"image\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\",\n" +
            "    \"rating_count\":\"80\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"10\",\n" +
            "    \"total_like\":\"100\",\n" +
            "    \"total_comment\":\"5\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.teste.com\",\n" +
            "    \"phone\":\"(11)99971-4475\",\n" +
            "    \"email\":\"teste@gmail.com\",\n" +
            "    \"desc\":\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\",\n" +
            "    \"address\":\"Rua Deputado Silva, 895\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"https://www.hertrack.com/wp-content/uploads/2018/10/no-image.jpg\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "]"
}
