month = int(input())

months_dict =  {1: "January",
                2: "February",
                3: "March",
                4: "April",
                5: "May",
                6: "June",
                7: "july",
                8: "August",
                9: "September",
                10: "October",
                11: "November",
                12: "December"}

if month > 0 and month <= 12:
    print(months_dict[month]) 

