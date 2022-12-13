Feature: Search on booking.com

  @Smoke
  Scenario: Search by city criteria
    Given User is looking for a hotel in 'London' city
    When User does search
    Then Hotel 'Montcalm Royal London House-City of London' should be on the first page

  Scenario Outline: Search by different cities criteria
    Given User is looking for a hotel in '<City>' city
    When User does search
    Then Hotel '<Hotel>' should be on the first page

    Examples:
      | City       | Hotel                                      |
      | London     | Montcalm Royal London House-City of London |
      | Washington | Riggs Washington DC                        |
      | Madrid     | Hostal Evoke Madrid                        |

  Scenario: Search by hotel criteria
    Given User is looking for a 'Samesun Toronto' hotel
    When User does hotel search
    Then Hotel 'Samesun Toronto' should be on the first page
    And Hotel 'Samesun Toronto' rating is '7.1'

  Scenario Outline: Search by different hotels and rating criteria
    Given User is looking for a '<Hotel>' hotel
    When User does hotel search
    Then Hotel '<Hotel>' should be on the first page
    And Hotel '<Hotel>' rating is '<Rating>'

    Examples:
      | Hotel                | Rating |
      | Lord Baltimore Hotel | 7.5    |
      | Meliá Berlin         | 8.3    |
      | Villacai             | 8.1    |