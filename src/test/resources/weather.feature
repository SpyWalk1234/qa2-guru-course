Feature: Weather forecast
  Scenario: One day weather forecast check
    Given location coordinates:
      | latitude | 52.52     |
      | longitude| 13.419998 |

    When we are requesting weather data

    Then main information is:
      | latitude              | 52.52               |
      | longitude             | 13.419998           |
      | generationtime_ms     | 0.14781951904296875 |
      | utc_offset_seconds    | 0                   |
      | timezone              | GMT                 |
      | timezone_abbreviation | GMT                 |
      | elevation             | 38.0                |

    And current units are:
      | time            | iso8601 |
      | interval        | seconds |
      | temperature_2m  | °C      |
      | rain            | mm      |
      | is_day          |         |

    And current weather is:
      | time            | 2025-06-18T16:15 |
      | interval        | 900              |
      | temperature_2m  | 25.3             |
      | rain            | 0.00             |
      | is_day          | 1                |

    And daily units are:
      | time               | iso8601  |
      | sunrise            | iso8601  |
      | sunset             | iso8601  |
      | temperature_2m_max | °C       |
      | temperature_2m_min | °C       |
      | daylight_duration  | s        |
      | rain_sum           | mm       |
      | wind_speed_10m_max | km/h     |